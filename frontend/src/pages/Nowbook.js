import React, { useEffect, useState } from "react";
import "react-calendar/dist/Calendar.css";
import "../App.css"; // Ensure you import your custom CSS file
import FullCalendar from '@fullcalendar/react';
import dayGridPlugin from '@fullcalendar/daygrid';
import axios from 'axios';

const baseURL = process.env.REACT_APP_SERVER;
const apiUrl = `${baseURL}`;

const Nowbook = () => {
  const [events, setEvents] = useState([]);

  useEffect(() => {
    const fetchReservations = async () => {
      try {
        const response = await axios.get(`${apiUrl}/users`);
        const reservations = response.data;
        
        const eventList = reservations.map(reservation => ({
          title: reservation.username,
          date: reservation.date
        }));

        setEvents(eventList);
      } catch (error) {
        console.error('Error fetching reservations', error);
      }
    };

    fetchReservations();
  }, []);


  return (
    <div className="App">
      <FullCalendar 
        defaultView="dayGridMonth" 
        plugins={[dayGridPlugin]}
        height="auto"
        events={events}
      />
    </div>
  );
}

export default Nowbook;
