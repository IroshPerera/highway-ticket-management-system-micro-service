package lk.ijse.ticket_user_service.service;

import java.util.List;

public interface UserService<T,ID> {
    void save(T dto);
    void update(T dto);
    void delete(ID id);
    T search(ID id);
    List<T> getAll();

    boolean isExist(String id);
}
