package onliner.dao.mobile;

import onliner.entity.mobile.Screen;

public interface ScreenDao {
    Screen findByModel(String model);
}
