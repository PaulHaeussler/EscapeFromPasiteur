package de.pasiteur.EscapeFromPasiteur.commands;

/**
 * Data object for commands that should get registered
 */
public class RegistrationCommand
{

    private CommandBase commandExecutor;
    private String commandName;

    public RegistrationCommand(){}

    public RegistrationCommand(String commandName, CommandBase command)
    {
        this.setName(commandName);
        this.setCommandExecutor(command);
    }

    public void setCommandExecutor(CommandBase commandExecutor)
    {
        this.commandExecutor = commandExecutor;
    }

    public void setName(String commandName)
    {
        this.commandName = commandName;
    }

    public CommandBase getCommandExecutor()
    {
        return this.commandExecutor;
    }

    public String getCommandName()
    {
        return this.commandName;
    }

}
