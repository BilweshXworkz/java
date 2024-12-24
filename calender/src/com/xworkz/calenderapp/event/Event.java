package com.xworkz.calenderapp.event;

import com.xworkz.calenderapp.constants.EventType;
import lombok.*;

@Getter
@Setter
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor

public class Event {
        private int eventId;
        private String who;
        private String startDate;
        private String endDate;
        private String description;
        private EventType EventType;
        private boolean allDayEvent;

        @Override
        public int hashCode(){
                return this.eventId;
        }

        @Override
        public String toString() {
                return "Event{" +
                        "eventId=" + eventId +
                        ", who='" + who + '\'' +
                        ", startDate='" + startDate + '\'' +
                        ", endDate='" + endDate + '\'' +
                        ", description='" + description + '\'' +
                        ", EventType=" + EventType +
                        ", allDayEvent=" + allDayEvent +
                        '}';
        }

        @Override
        public boolean equals(Object obj){
                Event event1 = (Event)obj;
                if(this.eventId == event1.eventId &&
                        this.who == event1.who &&
                        this.startDate == event1.startDate &&
                        this.endDate == event1.endDate &&
                        this.description == event1.description &&
                        this.EventType == event1.EventType &&
                        this.allDayEvent == event1.allDayEvent)
                        return true;
                return false;
        }

}
