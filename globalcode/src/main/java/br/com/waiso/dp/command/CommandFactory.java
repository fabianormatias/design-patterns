package br.com.waiso.dp.command;

public interface CommandFactory {

	public BaseCommand create(String name);

}
