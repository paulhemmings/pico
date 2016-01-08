package razor.lib.interfaces;

public interface IModelItem {
	
	
	public enum eModelType { Routine, Exercise, ExerciseType, ExerciseSummary, Workout, RoutineExercise, WorkoutExercise };
	Integer getID();	
	String getTitle();
}

