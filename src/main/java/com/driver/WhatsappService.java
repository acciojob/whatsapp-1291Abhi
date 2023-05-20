package com.driver;

import java.util.Date;
import java.util.List;

public class WhatsappService {
    WhatsappRepository whatsappRepository=new WhatsappRepository();
    public String createUser(String name, String mobile) throws Exception {
        whatsappRepository.createUser(name,mobile);
        return "SUCCESS";
    }

    public String findMessage(Date start, Date end, int k) {
        return "";
    }

    public int removeUser(User user) {
        return 0;
    }

    public String changeAdmin(User approver, User user, Group group) {
        return "";
    }

    public int sendMessage(Message message, User sender, Group group) {
        return 0;
    }

    public int createMessage(String content) {
        return 0;
    }

    public Group createGroup(List<User> users) {
        return whatsappRepository.createGroup(users);

    }
}
