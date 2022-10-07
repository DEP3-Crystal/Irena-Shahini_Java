package com.crystal.examples;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class AlertService {
    AlertDAO a;
    public AlertService(AlertDAO a){
       this.a = a;
    }
    private final MapAlertDAO storage = new MapAlertDAO();

    public UUID raiseAlert() {
        return this.a.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.a.getAlert(id);
    }
}


interface AlertDAO{
    public UUID addAlert(Date time);
    public Date getAlert(UUID id);

}

class MapAlertDAO implements AlertDAO{
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}
