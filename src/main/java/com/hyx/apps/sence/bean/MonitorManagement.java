package com.hyx.apps.sence.bean;

/**
 * 监控信息管理的bean
 *
 * @author anke
 * @date 2018/4/19
 */
public class MonitorManagement {
    private String imgId;
    private String imgName;
    private String deviceId;
    private String deviceName;
    private String mushBaseId;
    private String mushBaseName;
    private String mushRoomId;
    private String mushRoomName;
    private String userId;
    private String userName;
    private String imgContent;
    private String delFlag;
    private String memo;
    private String ctime;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getMushBaseId() {
        return mushBaseId;
    }

    public void setMushBaseId(String mushBaseId) {
        this.mushBaseId = mushBaseId;
    }

    public String getMushBaseName() {
        return mushBaseName;
    }

    public void setMushBaseName(String mushBaseName) {
        this.mushBaseName = mushBaseName;
    }

    public String getMushRoomId() {
        return mushRoomId;
    }

    public void setMushRoomId(String mushRoomId) {
        this.mushRoomId = mushRoomId;
    }

    public String getMushRoomName() {
        return mushRoomName;
    }

    public void setMushRoomName(String mushRoomName) {
        this.mushRoomName = mushRoomName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImgContent() {
        return imgContent;
    }

    public void setImgContent(String imgContent) {
        this.imgContent = imgContent;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "MonitorManagement{" +
                "imgId='" + imgId + '\'' +
                ", imgName='" + imgName + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", mushBaseId='" + mushBaseId + '\'' +
                ", mushBaseName='" + mushBaseName + '\'' +
                ", mushRoomId='" + mushRoomId + '\'' +
                ", mushRoomName='" + mushRoomName + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", imgContent='" + imgContent + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", memo='" + memo + '\'' +
                ", ctime='" + ctime + '\'' +
                '}';
    }
}
