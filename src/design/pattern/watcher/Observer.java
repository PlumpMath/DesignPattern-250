package design.pattern.watcher;

// 所有的观察者需要实现此接口
public interface Observer {
	public void update(String msg); 
}
