import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

export default function AdminLoginPage() {
    const [id, setId] = useState('');
    const [password, setPassword] = useState('');
    const navigate = useNavigate();

    const handleLogin = (event) => {
        event.preventDefault();
        if (id === 'admin' && password === '1234') {
            alert('로그인되었습니다.');
            navigate('/admin/selectmenu');
        } else {
            alert('ID 또는 비밀번호가 잘못되었습니다.');
        }
    };

    return (
        <div>
            <h1>관리자 로그인</h1>
            <form onSubmit={handleLogin}>
                <div>
                    <label>ID: </label>
                    <input
                        type="text"
                        value={id}
                        onChange={(e) => setId(e.target.value)}
                    />
                </div>
                <div>
                    <label>Password: </label>
                    <input
                        type="password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                    />
                </div>
                <button type="submit">로그인</button>
            </form>
        </div>
    );
}
