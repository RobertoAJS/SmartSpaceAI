package pe.edu.smartspace.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaPromedioDTO {
    private String categoria;
    private Double promedioPrecio;
}
