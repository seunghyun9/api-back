package net.seunghyun.api.buy.domain;

/**
 * packageName: net.seunghyun.api.buy.domain
 * fileName   : BuyDTO
 * author     : seunghyun9
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     seunghyun9    최초 생성
 */
public class BuyDTO {
    private final static BuyDTO buyDTO = new BuyDTO();
    public BuyDTO(){}
    public static BuyDTO getInstance(){return buyDTO;}


    public String num;
    public String mem_id;
    public String prod_name;
    public String group_name;
    public String price;
    public String amount;








}
