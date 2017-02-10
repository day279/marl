package edu.osu.cse.cse_5522;

import java.util.List;

import model.Unit;

public interface BoardFactory {

	Board createBoard(int[] boardSize, List<Unit> team1, List<Unit> team2);
}