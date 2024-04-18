package com.hua.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hua.entity.user.Favorites;
import com.hua.mapper.user.FavoritesMapper;
import com.hua.service.user.FavoritesService;
import com.hua.service.user.FavoritesVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritesServiceImpl  extends ServiceImpl<FavoritesMapper, Favorites> implements FavoritesService {

    @Autowired
    private FavoritesVideoService favoritesVideoService;

    @Override
    public void remove(Long id, Long userId) {

    }

    @Override
    public List<Favorites> listByUserId(Long userId) {
        return null;
    }

    @Override
    public List<Long> listVideoIds(Long favoritesId, Long userId) {
        return null;
    }

    @Override
    public boolean favorites(Long fId, Long vId) {
        return false;
    }

    @Override
    public Boolean favoritesState(Long videoId, Long userId) {
        return null;
    }

    @Override
    public void exist(Long userId, Long defaultFavoritesId) {

    }
}
