package com.tutorial.application.charge;

import com.tutorial.infrastructure.gateways.Chargeable;
import com.tutorial.infrastructure.notifications.EmailNotification;
import com.tutorial.infrastructure.notifications.Notificable;
import com.tutorial.infrastructure.printing.LocalPrinter;
import com.tutorial.infrastructure.printing.Printable;

public class ChargeService {

    public void charge(Chargeable chargeable){
        chargeable.executeCharge();

        final Notificable notificable = new EmailNotification();
        notificable.doNotification();

        final Printable printable = new LocalPrinter();
        printable.print("Some text");
    }
}
