/*
 * MIT License
 *
 * Copyright (c) 2016 BotMill.io
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package co.aurasphere.botmill.telegram.test;

import co.aurasphere.botmill.telegram.AbstractTelegramBot;
import co.aurasphere.botmill.telegram.TelegramBotMillContext;
import co.aurasphere.botmill.telegram.autoreply.EchoAutoReply;
import co.aurasphere.botmill.telegram.event.message.AnyMessageEvent;
import co.aurasphere.botmill.telegram.support.update.UpdateService;

/**
 * The Class Test.
 */
public class Test extends AbstractTelegramBot {
	
	public static void main(String[] args) {
		TelegramBotMillContext.getInstance().setBotToken("358031745:AAFelK4OPmDHYAumHZcPStMIqhMwZqNxQ2s");
		UpdateService.setWebhook("http:");
	}

	/* (non-Javadoc)
	 * @see co.aurasphere.botmill.telegram.TelegramBotDefinition#defineBehavior()
	 */
	public void defineBehavior() {

		addActionFrame(new AnyMessageEvent(), new EchoAutoReply());
	}
	
	

}
