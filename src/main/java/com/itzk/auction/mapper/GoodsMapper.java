package com.itzk.auction.mapper;



import com.itzk.auction.model.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {


    int deleteByPrimaryKey(Long gId);

    int insert(Goods goods);

    int insertSelective(Goods goods);


    Goods selectByPrimaryKey(Long gId);


    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}