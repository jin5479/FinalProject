import React from 'react';
import lachelnProfileImg from '../assets/img/lachelnProfileImg.png';
import '../assets/css/noticePageStyle.css'

const RoomNoticePage = () => {
  return (
    <div className="wrapper">
      <div className="header">
        <h1>강남 합주실</h1>
      </div>
      <section className="mainContainer">
        <div className="noticeHeader">
          <span>[공지]</span> <span>예약 및 이용 관련 안내</span>
        </div>
        <div className="profile">
          <img src={lachelnProfileImg} alt="프로필이미지" />
          <span className="profile-name">Lacheln</span>
        </div>
        <div className="noticeContent">
          <p>#예약 및 이용 관련 안내#</p>
          <p>24시간 연중 무휴로 운영 합니다. (저녁12시 넘어서는 응대가 어려울 수 있습니다.)</p>
          <p>(초등생 사용 불가x )</p>
          <p>주소 : 이공관</p>
          <p>기본적으로 무인 운영을 진행하며 운영자 스케줄에 따라 사용 시 문의에 답이 늦어질 수 있습니다.</p>
          <p>#예약 방법#</p>
          <p className="howToReserve">
            1. 예약일 / 시간 (24시로 적어주세요 ex: x월x일 15시~16시30분)<br />
            (최소1시간 + 30분 단위 가능) <br />
            <br />
            2. 예약자명 <br />
            (강대생일 경우 밴드명까지 / 할인관련 정보 기재) <br />
            <br />
            3. 파트 <br />
            보컬/기타/건반/베이스/드럼  <br />
            각 파트 인원 적어주시고<br />
            *건반2대 사용시 당일 예약은<br />
            세팅이 불가할 수 있습니다.*<br />
            <br />
            4. 기타 요청 사항 <br />
            *악기대여는 당일 대여가<br />
            불가능할 수 있습니다.* <br />
            <br />
            이렇게 적어주시면 됩니다!! <br />
            <br />
            예약 현황은 아래 링크에서 확인 가능합니다! <br />
            <a href="/cal">예약 현황</a>
          </p>
          <p className="noticeBreak">[중요] 합주실 이용 중 파손건에 대하여</p>
          <p>알려주시지 않은 파손건에 대해서는 전액 수리비 청구 하도록 합니다!! <br />
            신경써주시고 잘 사용해 주시는 분들게는 늘 감사드립니다^^</p>
        </div>
      </section>
    </div>
  );
};

export default RoomNoticePage;
