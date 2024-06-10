import React from "react";
import "react-calendar/dist/Calendar.css";
import "../App.css"; // Ensure you import your custom CSS file
import { render } from '@testing-library/react';
import FullCalendar from '@fullcalendar/react';
import dayGridPlugin from '@fullcalendar/daygrid';

const Nowbook = () => {
    return(
      <div className="App">
        <FullCalendar 
          defaultView="dayGridMonth" 
          plugins={[dayGridPlugin]}
          // headerToolbar={{
          //   left: 'prev,next today',
          //   center: 'title',
          //   right: 'dayGridMonth,dayGridWeek,dayGridDay'
          // }}
          height="auto"
          events={[
            {title:'홍성현 15~13',date:'2024-06-09'},
            {title:'홍성현 개인 연습',date:'2024-06-09'},
            {title:'홍성현 개인 연습',date:'2024-06-09'},
            {title:'홍성현 개인 연습',date:'2024-06-09'},
          ]}
        />
      </div>
    );
}

export default Nowbook;
