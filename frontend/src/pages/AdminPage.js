import axios from "axios";
import { useEffect, useState } from "react";

const baseURL = process.env.REACT_APP_SERVER;
const apiUrl = `${baseURL}`;

export default function AdminPage() {
    const [userInfo, setUserInfo] = useState([]);
    const [checkedUsers, setCheckedUsers] = useState([]);

    useEffect(() => {
        const getUserInfoList = async () => {
            try {
                const response = await axios.get(`${apiUrl}/admin/users`);
                setUserInfo(response.data);
            } catch (error) {
                console.error("에러!", error);
            }
        };
        getUserInfoList();
    }, []);

    const handleCheckboxChange = (user) => {
        setCheckedUsers(prev => {
            if (prev.includes(user)) {
                return prev.filter(u => u !== user);
            } else {
                return [...prev, user];
            }
        });
    };

    const handlePostCheckedUsers = async () => {
        try {
            const response = await axios.post(`${apiUrl}/admin/checking`, checkedUsers);
            console.log("Checked users posted successfully:", response.data);
        } catch (error) {
            console.error("Error posting checked users:", error);
        }
    };

    return (
        <div>
            <h1>User Information</h1>
            <table>
                <thead>
                    <tr>
                        <th>Index</th>
                        <th>Username</th>
                        <th>date</th>
                        <th>password</th>
                    </tr>
                </thead>
                <tbody>
                    {userInfo.map((user, index) => (
                        <tr key={index}>
                            <td>{user.idx}</td>
                            <td>{user.username}</td>
                            <td>{user.date}</td>
                            <td>{user.password}</td>
                            <td>
                                <input
                                    type="checkbox"
                                    checked={checkedUsers.includes(user)}
                                    onChange={() => handleCheckboxChange(user)}
                                />
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
            <button onClick={handlePostCheckedUsers}>Submit Checked Users</button>
        </div>
    );
}
