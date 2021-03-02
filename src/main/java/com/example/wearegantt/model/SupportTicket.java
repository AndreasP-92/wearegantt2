package com.example.wearegantt.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class SupportTicket {
    private int supportTicket_id;
    private String supportTicket_title;
    private String supportTicket_context;
//    @JsonFormat(pattern = "yyyy-mm-dd hh:mm:ss")
    private String supportTicket_timestamp;
    private String supportTicket_ownerMail;
    private String supportTicket_ownerName;
    private int supportTicket_active;
    private int supportTicket_taken;
    private int supportTicket_adminReplied;
    private int supportTicket_userReplied;

    public SupportTicket(int supportTicket_id, String supportTicket_title, String supportTicket_context, String supportTicket_timestamp, String supportTicket_ownerMail, String supportTicket_ownerName, int supportTicket_active, int supportTicket_taken, int supportTicket_adminReplied, int supportTicket_userReplied) {
        this.supportTicket_id = supportTicket_id;
        this.supportTicket_title = supportTicket_title;
        this.supportTicket_context = supportTicket_context;
        this.supportTicket_timestamp = supportTicket_timestamp;
        this.supportTicket_ownerMail = supportTicket_ownerMail;
        this.supportTicket_ownerName = supportTicket_ownerName;
        this.supportTicket_active = supportTicket_active;
        this.supportTicket_taken = supportTicket_taken;
        this.supportTicket_adminReplied = supportTicket_adminReplied;
        this.supportTicket_userReplied = supportTicket_userReplied;
    }

    public int getSupportTicket_id() {
        return supportTicket_id;
    }

    public void setSupportTicket_id(int supportTicket_id) {
        this.supportTicket_id = supportTicket_id;
    }

    public String getSupportTicket_title() {
        return supportTicket_title;
    }

    public void setSupportTicket_title(String supportTicket_title) {
        this.supportTicket_title = supportTicket_title;
    }

    public String getSupportTicket_context() {
        return supportTicket_context;
    }

    public void setSupportTicket_context(String supportTicket_context) {
        this.supportTicket_context = supportTicket_context;
    }

    public String getSupportTicket_timestamp() {
        return supportTicket_timestamp;
    }

    public void setSupportTicket_timestamp(String supportTicket_timestamp) {
        this.supportTicket_timestamp = supportTicket_timestamp;
    }

    public String getSupportTicket_ownerMail() {
        return supportTicket_ownerMail;
    }

    public void setSupportTicket_ownerMail(String supportTicket_ownerMail) {
        this.supportTicket_ownerMail = supportTicket_ownerMail;
    }

    public String getSupportTicket_ownerName() {
        return supportTicket_ownerName;
    }

    public void setSupportTicket_ownerName(String supportTicket_ownerName) {
        this.supportTicket_ownerName = supportTicket_ownerName;
    }

    public int getSupportTicket_active() {
        return supportTicket_active;
    }

    public void setSupportTicket_active(int supportTicket_active) {
        this.supportTicket_active = supportTicket_active;
    }

    public int getSupportTicket_taken() {
        return supportTicket_taken;
    }

    public void setSupportTicket_taken(int supportTicket_taken) {
        this.supportTicket_taken = supportTicket_taken;
    }

    public int getSupportTicket_adminReplied() {
        return supportTicket_adminReplied;
    }

    public void setSupportTicket_adminReplied(int supportTicket_adminReplied) {
        this.supportTicket_adminReplied = supportTicket_adminReplied;
    }

    public int getSupportTicket_userReplied() {
        return supportTicket_userReplied;
    }

    public void setSupportTicket_userReplied(int supportTicket_userReplied) {
        this.supportTicket_userReplied = supportTicket_userReplied;
    }

    @Override
    public String toString() {
        return "SupportTicket{" +
                "supportTicket_id=" + supportTicket_id +
                ", supportTicket_title='" + supportTicket_title + '\'' +
                ", supportTicket_context='" + supportTicket_context + '\'' +
                ", supportTicket_timestamp='" + supportTicket_timestamp + '\'' +
                ", supportTicket_ownerMail='" + supportTicket_ownerMail + '\'' +
                ", supportTicket_ownerName='" + supportTicket_ownerName + '\'' +
                ", supportTicket_active=" + supportTicket_active +
                ", supportTicket_taken=" + supportTicket_taken +
                ", supportTicket_adminReplied=" + supportTicket_adminReplied +
                ", supportTicket_userReplied=" + supportTicket_userReplied +
                '}';
    }
}
