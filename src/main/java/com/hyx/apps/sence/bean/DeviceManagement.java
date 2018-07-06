package com.hyx.apps.sence.bean;

/**
 * 设备管理的bean
 *
 * @author anke
 * @date 2018/4/19
 */
public class DeviceManagement {
    private String deviceId;
    private String deviceName;
    private String mushBaseId;
    private String mushBaseName;
    private String mushRoomId;
    private String mushRoomName;
    private String installerId;
    private String installerName;
    private String installerPhone;
    private String installerTime;
    private String maintenanceId;
    private String maintenanceName;
    private String maintenancePhone;
    private String delFlag;
    private String memo;
    private String ctime;

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

    public String getInstallerId() {
        return installerId;
    }

    public void setInstallerId(String installerId) {
        this.installerId = installerId;
    }

    public String getInstallerName() {
        return installerName;
    }

    public void setInstallerName(String installerName) {
        this.installerName = installerName;
    }

    public String getInstallerPhone() {
        return installerPhone;
    }

    public void setInstallerPhone(String installerPhone) {
        this.installerPhone = installerPhone;
    }

    public String getInstallerTime() {
        return installerTime;
    }

    public void setInstallerTime(String installerTime) {
        this.installerTime = installerTime;
    }

    public String getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(String maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    public String getMaintenanceName() {
        return maintenanceName;
    }

    public void setMaintenanceName(String maintenanceName) {
        this.maintenanceName = maintenanceName;
    }

    public String getMaintenancePhone() {
        return maintenancePhone;
    }

    public void setMaintenancePhone(String maintenancePhone) {
        this.maintenancePhone = maintenancePhone;
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
        return "DeviceManagement{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", mushBaseId='" + mushBaseId + '\'' +
                ", mushBaseName='" + mushBaseName + '\'' +
                ", mushRoomId='" + mushRoomId + '\'' +
                ", mushRoomName='" + mushRoomName + '\'' +
                ", installerId='" + installerId + '\'' +
                ", installerName='" + installerName + '\'' +
                ", installerPhone='" + installerPhone + '\'' +
                ", installerTime='" + installerTime + '\'' +
                ", maintenanceId='" + maintenanceId + '\'' +
                ", maintenanceName='" + maintenanceName + '\'' +
                ", maintenancePhone='" + maintenancePhone + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", memo='" + memo + '\'' +
                ", ctime='" + ctime + '\'' +
                '}';
    }
}
