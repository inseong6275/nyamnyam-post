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

public class BucketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long customerID;
    private boolean payment;
    private long hotelId;
    private String hotelName;
    private Date startEntry;
    private Date endEntry;
    private Double price;
    private boolean booked;
}
