package de.pasiteur.EscapeFromPasiteur.commands;

/**
 * CLass that provides all commands that should get registered to the Main class.
 * Here all command registrations should be made
 */
public class CommandProvider
{

    final private static RegistrationCommand[] registrationCommands = {
            new RegistrationCommand("hello", new CommandHello())
    };

    /**
     * Method which returns all registration commands
     *
     * @return RegistrationCommand[]
     */
    public static RegistrationCommand[] getRegistrationCommands()
    {
        return CommandProvider.registrationCommands;
    }
}
