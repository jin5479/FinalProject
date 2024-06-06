import React, { useState } from 'react';
import roomImg from '../assets/img/room1.jpg';
import roomImg2 from '../assets/img/room2.jpg';
import roomImg3 from '../assets/img/room3.jpg';
import '../assets/css/mainPageCSS.css';
import Button from '../components/Button';
import noticeIcon from '../assets/img/noticeIcon.png';
import scheduleIcon from '../assets/img/scheduleIcon.png';
import writeIcon from '../assets/img/writeIcon.png';

const images = [roomImg, roomImg2, roomImg3];

export default function MainPage() {
    const [currentIndex, setCurrentIndex] = useState(0);

    const handleMoveLeft = () => {
        setCurrentIndex((prevIndex) => (prevIndex - 1 + images.length) % images.length);
    };

    const handleMoveRight = () => {
        setCurrentIndex((prevIndex) => (prevIndex + 1) % images.length);
    };

    return (
        <>
            <div className='roomContainer'>
                <button onClick={handleMoveLeft} className='moveButton'>Left</button>
                <div className='imgWrapper'>
                    <img 
                        className='roomImgStyle' 
                        src={images[currentIndex]} 
                        alt="이미지" 
                    />
                </div>
                <button onClick={handleMoveRight} className='moveButton'>Right</button>
            </div>

            <div className='noticeContainer'>
                <Button title="이용 관련 안내" url="https://www.naver.com/" img={noticeIcon}/>
                <Button title="예약 현황" url="https://www.google.co.kr/" img={scheduleIcon}/>
                <Button title="예약 하기" url="https://section.cafe.naver.com/ca-fe/home" img={writeIcon}/>
            </div>
        </>
    );
}
