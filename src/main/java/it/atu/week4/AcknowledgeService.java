package it.atu.week4;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class AcknowledgeService {
    public String ackMesssge(UserDetails user){
       String message = "Thank you " + user.getName() + "your request has been recived";
       return message;
    }
}
