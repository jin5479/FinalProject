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
                <Button title="이용 관련 안내" url="https://www.naver.com/"/>
                <Button title="예약 현황" url="https://www.google.co.kr/"/>
                <Button title="예약 하기" url="https://section.cafe.naver.com/ca-fe/home"/>
            </div>
        </>
        
    )
}