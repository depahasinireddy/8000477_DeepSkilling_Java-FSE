package com.test;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void save(String data) {
        api.saveData(data);
    }

    public String fetchUser(String id) {
        return api.getUser(id);
    }
}