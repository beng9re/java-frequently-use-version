package streams;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class BasicStreamTest {


    @Test
    @DisplayName("필터링 테스트")
    void filter() {
        //given
        final List<String> initData = List.of("a", "b", "c", "d", "e");

        //when
        List<String> filterData = initData.stream()
                .filter((data) -> data.equals("a"))
                .collect(Collectors.toList());

        //then
        assertAll(
                () -> assertThat(filterData).hasSize(1),
                () -> assertThat(filterData).contains("a"),
                () -> assertThat(filterData).doesNotContain("b")
        );
    }


}