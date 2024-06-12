import { useNavigate } from 'react-router-dom';
import '../assets/css/adminPageStyle.css';

const baseURL = process.env.REACT_APP_SERVER;
const apiUrl = `${baseURL}`;

export default function AdminPage() {

    const navigate = useNavigate();

    const goToPostUser=()=>{
        navigate('/admin/postuser')
    }

    const goToCal=()=>{
        navigate('/cal')
    }

    const goToDeleteUser=()=>{
        navigate('/admin/deleteuser');
    }

    const goToHome=()=>{
        navigate('/');
    }

    return (
        <div className="button-container">
            <div>
                <button onClick={goToPostUser}>신청된 예약 관리</button>
                <button onClick={goToCal}>예약 현황 보기</button>
            </div>
            <div>
            <button onClick={goToDeleteUser}>예약 현황 관리</button>
                
                <button onClick={goToHome}>홈으로</button>
            </div>
        </div>
    );
}
