cmake_minimum_required(VERSION 3.4.1)

add_executable( # Specifies the name of the library.
        stockfish_exe

        # Provides a relative path to your source file(s).
        benchmark.cpp
        bitbase.cpp
        bitboard.cpp
        endgame.cpp
        evaluate.cpp
        main.cpp
        material.cpp
        misc.cpp
        movegen.cpp
        movepick.cpp
        pawns.cpp
        position.cpp
        psqt.cpp
        search.cpp
        thread.cpp
        timeman.cpp
        tt.cpp
        uci.cpp
        ucioption.cpp
        ./syzygy/tbprobe.cpp)

