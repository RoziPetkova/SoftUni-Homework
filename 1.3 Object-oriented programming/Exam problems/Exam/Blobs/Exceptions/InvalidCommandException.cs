﻿namespace Blops.Exceptions
{
    public class InvalidCommandException : BlopException
    {
        public InvalidCommandException(string msg)
            : base(msg)
        {
        }
    }
}
