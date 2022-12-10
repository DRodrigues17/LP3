package poc.springresttemplate.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pokemon {

    private int id;
    @Setter
    private String name;
    private int base_experience;
    private int height;
    private boolean is_default;
    private int order;
    private int weight;


}
