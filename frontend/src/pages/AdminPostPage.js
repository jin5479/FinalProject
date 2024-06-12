import axios from 'axios';
import { useState, useEffect } from 'react';
import '../assets/css/adminPostPage.css';

const baseURL = process.env.REACT_APP_SERVER;
const apiUrl = `${baseURL}`;

export default function AdminPostPage() {
    const [userInfo, setUserInfo] = useState([]);

    // users 테이블 get
    useEffect(() => {
        const getUserInfoList = async () => {
            try {
                const response = await axios.get(`${apiUrl}/admin/users`);
                setUserInfo(response.data);
                console.log(response.data);
            } catch (error) {
                console.error("Error!", error);
            }
        };

        getUserInfoList();
    }, []);

    const handleSubmit = async (e, user) => {
        e.preventDefault();

        const postInfo = {
            username: user.username,
            date: user.date
        };

        // reservation 테이블에 post
        try {
            const response = await axios.post(`${apiUrl}/admin/checking`, postInfo);
            console.log('Post complete', response.data);
            alert('최종 등록 되었습니다!');
        
        } catch (error) {
            console.error('Error', error);
        }
    };

    const handleUsernameChange = (e, user) => {
        const { value } = e.target;
        setUserInfo(userInfo.map(u => (u.idx === user.idx ? { ...u, username: value } : u)));
    };

    const handleDateChange = (e, user) => {
        const { value } = e.target;
        setUserInfo(userInfo.map(u => (u.idx === user.idx ? { ...u, date: value } : u)));
    };

    const handleDelete = async (id) => {
        try {
            await axios.delete(`${apiUrl}/user/${id}`);
            setUserInfo(userInfo.filter(user => user.idx !== id));
            console.log('Delete complete');
            alert('삭제되었습니다!');
        } catch (error) {
            console.error('Error', error);
        }
    };

    return (
        <div className="admin-post-page">
            {userInfo.map(user => (
                <form key={user.idx} onSubmit={(e) => handleSubmit(e, user)}>
                    <div>
                        <label>신청자(시간): </label>
                        <input
                            type="text"
                            value={user.username}
                            onChange={(e) => handleUsernameChange(e, user)}
                        />
                    </div>
                    <div>
                        <label>신청한 날짜(yyyy-mm-dd): </label>
                        <input
                            type="text"
                            value={user.date}
                            onChange={(e) => handleDateChange(e, user)}
                        />
                    </div>
                    <div className="button-group">
                        <button type="submit">최종 등록</button>
                        <button type="button" onClick={() => handleDelete(user.idx)}>예약 삭제</button>
                    </div>
                </form>
            ))}
            <button onClick={()=>window.location.href='/admin/selectMenu'}>관리 홈으로</button>
        </div>
    );
}
