package kr.nyamnyam_kr.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@ToString
@Table(name = "category")
@NoArgsConstructor(access = AccessLevel.PROTECTED)//Args 는 이거냐 레이지냐 => 얘는 생성자가 실행될때 작동한다. 상속할때 부모꺼 까지 가능
@AllArgsConstructor
public class HotelEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String name;
    public String address;
    public Date startEntry;
    public Date endEntry;
    public boolean booked;
    public double price;
    public long sellerId;
    public String content;
    public String shortContent;
    public long roomNumber;
    public long roomType;
    public long roomMember;
    public String nickname;
}