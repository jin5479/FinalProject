import roomImg from '../assets/img/room1.jpg'
import '../assets/css/mainPageCSS.css'
import Button from '../components/Button'
import noticeIcon from '../assets/img/noticeIcon.png'
import scheduleIcon from '../assets/img/scheduleIcon.png'
import writeIcon from '../assets/img/writeIcon.png'

export default function MainPage(){
    return(
        <>
            <div className='roomContainer'>
                <img className='roomImgStyle' src={roomImg} alt="이미지"/>
            </div>

            <div className='noticeContainer'>
                <Button title="이용 관련 안내" url="https://www.naver.com/" img={noticeIcon}/>
                <Button title="예약 현황" url="https://www.google.co.kr/" img={scheduleIcon}/>
                <Button title="예약 하기" url="https://section.cafe.naver.com/ca-fe/home" img={writeIcon}/>
            </div>
        </>
        
    )
}