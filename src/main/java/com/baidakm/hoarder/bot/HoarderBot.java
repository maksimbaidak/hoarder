package com.baidakm.hoarder.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class HoarderBot extends TelegramLongPollingBot {

	public String getBotUsername() {
		return "my_hoarder_bot";
	}

	@Override
	public String getBotToken() {
		return "5470912963:AAGKXmmzLGkLpUngkgK1Bpb9BTEJNp-f5U0";
	}

	public void onUpdateReceived(Update update) {
		if (update.hasMessage() && update.getMessage().hasText()) {
	        SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
	        message.setChatId(update.getMessage().getChatId().toString());
	        message.setText(update.getMessage().getText());
	        
	        try {
	            execute(message); // Call method to send the message
	        } catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
