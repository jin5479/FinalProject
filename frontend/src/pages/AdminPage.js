import '../assets/css/adminPageStyle.css';

const baseURL = process.env.REACT_APP_SERVER;
const apiUrl = `${baseURL}`;

export default function AdminPage() {
    return (
        <div className="button-container">
            <div>
                <button onClick={()=>window.location.href='/admin/postuser'}>신청된 예약 관리</button>
                <button onClick={()=>window.location.href='/cal'}>예약 현황 보기</button>
            </div>
            <div>
            <button onClick={()=>window.location.href='/admin/deleteuser'}>예약 현황 관리</button>
                
                <button onClick={()=>window.location.href='/'}>홈으로</button>
            </div>
        </div>
    );
}
