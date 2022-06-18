package uz.pdp.springbootapelsin.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.springbootapelsin.entity.Order;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class DetailDTO {
    private Integer orId;
    private Integer proId;
    private Short quantity;
}
