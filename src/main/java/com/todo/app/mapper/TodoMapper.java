package com.todo.app.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.app.entity.Todo;

@Mapper
public interface TodoMapper {
	public List<Todo> selectAll();
	public List<Todo> selectIncomplete();//タスクの未完了のみ検索する機能の追加
	public List<Todo> selectComplete();//タスクの完了も表示する機能の追加
	public void add(Todo todo); // タスクの追加機能の追加
	public void update(Todo todo);//タスクの更新機能の追加
	public void delete();//タスクの削除機能の追加　一括削除なので引数も戻り値もなし
	
}
