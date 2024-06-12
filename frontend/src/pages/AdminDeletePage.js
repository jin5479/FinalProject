import { useEffect, useState } from "react";
import axios from 'axios';
import { useNavigate } from "react-router-dom";

const baseURL = process.env.REACT_APP_SERVER;
const apiUrl = `${baseURL}`;


//reservation 테이블에 있는 db삭제 (캘린더에 나타나는 일정 삭제)
export default function AdminDeletePage(){
const [userInfo,setUserInfo] = useState([]);
const navigate = useNavigate();
    //reservation테이블 get
    useEffect(()=>{
        const getReservationTableInfo = async()=>{
            try{
                const response = await axios.get(`${baseURL}/admin/final`);
                setUserInfo(response.data);
            } catch (error){
                console.log('에러!',error);
            }
        };

        getReservationTableInfo();
        
    },[]);

    const handleDelete = async (id) => {
        try {
            await axios.delete(`${apiUrl}/admin/users/${id}`);
            setUserInfo(userInfo.filter(user => user.idx !== id));
            console.log('Delete complete');
            
        } catch (error) {
            console.error('Error', error);
        }
    };

    const goToAdminHome=()=>{
        navigate('/admin/selectMenu');
    }

    return(
        <div>
            {userInfo.map(user => (
                <form key={user.idx}>
                    <div>
                        <label>Username:</label>
                        <input 
                            type="text" 
                            value={user.username} 
                            readOnly
                        />
                    </div>
                    <div>
                        <label>Date: </label>
                        <input 
                            type="text" 
                            value={user.date} 
                           readOnly
                        />
                    </div>
                    
                    <button type="button" onClick={() => handleDelete(user.idx)}>Delete</button>
                </form>
            ))}
            <button onClick={goToAdminHome}>관리 홈으로</button>
        </div>
    )

}