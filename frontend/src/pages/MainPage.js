import React, { useState } from 'react';
import roomImg from '../assets/img/room1.jpg';
import roomImg2 from '../assets/img/room2.jpg';
import roomImg3 from '../assets/img/room3.jpg';
import '../assets/css/mainPageCSS.css';
import Button from '../components/Button';
import noticeIcon from '../assets/img/noticeIcon.png';
import scheduleIcon from '../assets/img/scheduleIcon.png';
import writeIcon from '../assets/img/writeIcon.png';
import { useNavigate } from "react-router-dom";

const images = [roomImg, roomImg2, roomImg3];

export default function MainPage() {
    const [currentIndex, setCurrentIndex] = useState(0);
    const navigate = useNavigate();

    const handleMoveLeft = () => {
        setCurrentIndex((prevIndex) => (prevIndex - 1 + images.length) % images.length);
    };

    const handleMoveRight = () => {
        setCurrentIndex((prevIndex) => (prevIndex + 1) % images.length);
    };

    const goToCal = () => {
        navigate("/cal");
    };

    const goToBook=()=>{
        navigate("/book");
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
                <Button title="이용 관련 안내" url="/notice" img={noticeIcon} />
                <Button title="예약 현황" img={scheduleIcon} onClick={goToCal} />
                <Button title="예약 하기" img={writeIcon} onClick={goToBook} />
            </div>
        </>
    );
}
