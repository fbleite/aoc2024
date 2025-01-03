import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day6Test {

    @Test
    void parseInput() {
        var input = """
                ....#.....
                .........#
                ..........
                ..#.......
                .......#..
                ..........
                .#..^.....
                ........#.
                #.........
                ......#...
                """;
        var actual = Day6.parseInput(input);
        var expected = new char [][] {
                {'.','.','.','.','#','.','.','.','.','.',},
                {'.','.','.','.','.','.','.','.','.','#',},
                {'.','.','.','.','.','.','.','.','.','.',},
                {'.','.','#','.','.','.','.','.','.','.',},
                {'.','.','.','.','.','.','.','#','.','.',},
                {'.','.','.','.','.','.','.','.','.','.',},
                {'.','#','.','.','^','.','.','.','.','.',},
                {'.','.','.','.','.','.','.','.','#','.',},
                {'#','.','.','.','.','.','.','.','.','.',},
                {'.','.','.','.','.','.','#','.','.','.',},
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void markPath() {
        var input = """
                ....#.....
                .........#
                ..........
                ..#.......
                .......#..
                ..........
                .#..^.....
                ........#.
                #.........
                ......#...
                """;
        var actual = Day6.parseInput(input);
        Day6.markPath(actual);
        var expected = new char [][] {
                {'.','.','.','.','#','.','.','.','.','.',},
                {'.','.','.','.','X','X','X','X','X','#',},
                {'.','.','.','.','X','.','.','.','X','.',},
                {'.','.','#','.','X','.','.','.','X','.',},
                {'.','.','X','X','X','X','X','#','X','.',},
                {'.','.','X','.','X','.','X','.','X','.',},
                {'.','#','X','X','X','X','X','X','X','.',},
                {'.','X','X','X','X','X','X','X','#','.',},
                {'#','X','X','X','X','X','X','X','.','.',},
                {'.','.','.','.','.','.','#','X','.','.',}
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void countPath() {
        var input = """
                ....#.....
                .........#
                ..........
                ..#.......
                .......#..
                ..........
                .#..^.....
                ........#.
                #.........
                ......#...
                """;
        var actual = Day6.parseInput(input);
        assertEquals(41, Day6.countPath(actual));
    }

    @Test
    void countTraps() {
        var input = """
                ....#.....
                .........#
                ..........
                ..#.......
                .......#..
                ..........
                .#..^.....
                ........#.
                #.........
                ......#...
                """;
        var actual = Day6.parseInput(input);
        assertEquals(6, Day6.countTraps(actual));
    }
}