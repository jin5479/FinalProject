import roomImg from '../assets/img/room1.jpg'
import '../assets/css/mainPageCSS.css'
import Button from '../components/Button'

export default function MainPage(){
    return(
        <>
            <div className='roomContainer'>
                <img className='roomImgStyle' src={roomImg} alt="이미지"/>
            </div>

            <div className='noticeContainer'>
                <Button title="이용 관련 안내"/>
                <Button title="예약 현황"/>
                <Button title="예약 하기"/>
            </div>
        </>
        
    )
}