package com.udacity.jwdnd.course1.cloudstorage.model;

public class Files {
    private String filename;
    private String contenttype;
    private String filesize;
    private int userid;
    private int fileId;
    private byte[] filedata;

    public Files(String filename, String contenttype, String filesize, int userid, int fileId, byte[] filedata) {
        this.filename = filename;
        this.contenttype = contenttype;
        this.filesize = filesize;
        this.userid = userid;
        this.fileId = fileId;
        this.filedata = filedata;
    }

    public Files() {
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public byte[] getFiledata() {
        return filedata;
    }

    public void setFiledata(byte[] filedata) {
        this.filedata = filedata;
    }
}


//    CREATE TABLE IF NOT EXISTS FILES (
//        fileId INT PRIMARY KEY auto_increment,
//        filename VARCHAR,
//        contenttype VARCHAR,
//        filesize VARCHAR,
//        userid INT,
//        filedata BLOB,
//        foreign key (userid) references USERS(userid)
//        );