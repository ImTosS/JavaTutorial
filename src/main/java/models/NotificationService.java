package models;

import interfaces.Notificable;

public class NotificationService {

    public void notificate(Notificable notificable){
        notificable.sendNotification();
    }
}
