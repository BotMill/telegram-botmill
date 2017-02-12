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
package co.aurasphere.botmill.telegram;

import java.util.ArrayList;
import java.util.List;

import co.aurasphere.botmill.telegram.support.TelegramBotMillMonitor;

/**
 * Class that contains all the context information used to handle bots and
 * communicate with Telegram. The context is a singleton.
 * 
 * @author Donato Rimenti
 * 
 */
public class TelegramBotMillContext {

	/**
	 * A list of the registered bots in the context. A {@link TelegramBot} can't
	 * be used unless it's registered to the context.
	 */
	private List<TelegramBot> registeredBots;

	/**
	 * The current instance.
	 */
	private static TelegramBotMillContext instance;

	/**
	 * The bot token used by Telegram for authentication. For more informations
	 * read Telegram Platform documentation.
	 * 
	 * @see <a href= "https://core.telegram.org/bots/api#authorizing-your-bot"
	 *      />Telegram bot authorization documentation</a>
	 * 
	 */
	private String botToken;

	/**
	 * Boolean that indicates whether the validator is enabled or not.
	 */
	private boolean validationEnabled;

	/**
	 * A list of the registered monitors in the context.
	 * 
	 */
	private List<TelegramBotMillMonitor> registeredMonitors;

	/**
	 * Instantiates a new TelegramBotMillContext. The validator is enabled by
	 * default.
	 */
	private TelegramBotMillContext() {
		this.registeredBots = new ArrayList<TelegramBot>();
		this.validationEnabled = true;
		this.registeredMonitors = new ArrayList<TelegramBotMillMonitor>();
	}

	/**
	 * Registers a {@link TelegramBot} to the context. A bot can't be used
	 * unless it's registered to the context.
	 * 
	 * @param telegramBot
	 *            the bot to register.
	 */
	void register(TelegramBot telegramBot) {
		if (telegramBot != null) {
			this.registeredBots.add(telegramBot);
		}
	}

	/**
	 * Gets the current instance of TelegramBotMillContext.
	 *
	 * @return the current instance of TelegramBotMillContext.
	 */
	public static TelegramBotMillContext getInstance() {
		if (instance == null) {
			instance = new TelegramBotMillContext();
		}
		return instance;
	}

	/**
	 * Gets the {@link #registeredBots}.
	 *
	 * @return the {@link #registeredBots}.
	 */
	public List<TelegramBot> getRegisteredBots() {
		return this.registeredBots;
	}

	/**
	 * Gets the {@link #botToken}.
	 *
	 * @return the {@link #botToken}.
	 */
	public String getBotToken() {
		return this.botToken;
	}

	/**
	 * Sets the {@link #botToken}.
	 *
	 * @param botToken
	 *            the {@link #botToken} to set.
	 */
	public void setBotToken(String botToken) {
		this.botToken = botToken;
	}

	/**
	 * Checks if is validation enabled.
	 *
	 * @return true, if is validation enabled
	 */
	public boolean isValidationEnabled() {
		return this.validationEnabled;
	}

	/**
	 * Sets the {@link #validationEnabled}.
	 *
	 * @param validationEnabled
	 *            the {@link #validationEnabled} to set.
	 */
	public void setValidationEnabled(boolean validationEnabled) {
		this.validationEnabled = validationEnabled;
	}

	/**
	 * Registers a monitor to the context. A monitor needs to be registered to
	 * this context in order to be used.
	 * 
	 * @param monitor
	 *            the monitor to be registered.
	 */
	public void registerMonitor(TelegramBotMillMonitor monitor) {
		this.registeredMonitors.add(monitor);
	}

	/**
	 * Gets the list of registered monitors to this context.
	 * 
	 * @return a list of registered monitors to this context.
	 */
	public List<TelegramBotMillMonitor> getRegisteredMonitors() {
		return this.registeredMonitors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TelegramBotMillContext [registeredBots=" + registeredBots
				+ ", botToken=" + botToken + ", validationEnabled="
				+ validationEnabled + "]";
	}

}
