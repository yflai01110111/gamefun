/*
 * Copyright 2014 Chris Banes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pizidea.framework.beans;

/**
 * 用户介绍
 */
public class UserProfile {

    Long _id;
    String username;
    String fullName;
    String avatarUrl;

    String gender;
    int age;
    String location;
    String about;
    int last_login;
    boolean vip;

    boolean twitterConnected;
    boolean facebookConnected;
    boolean pathConnected;
    boolean tumblrConnected;

    String defaultShareMessage;

    long lastFetched;

    public UserProfile() {}


    /*public PhilmUserProfile(Settings settings) {
        setFromTraktEntity(settings);
    }

    public void setFromTraktEntity(Settings settings) {
        final Settings.Profile profile = settings.profile;
        username = profile.username;
        avatarUrl = profile.avatar;
        fullName = profile.full_name;

        final Settings.Connections connections = settings.connections;
        twitterConnected = connections.twitter != null && connections.twitter.connected;
        facebookConnected = connections.facebook != null && connections.facebook.connected;
        pathConnected = connections.path != null && connections.path.connected;
        tumblrConnected = connections.tumblr != null && connections.tumblr.connected;

        final Settings.SharingText shareText = settings.sharing_text;
        if (shareText != null) {
            defaultShareMessage = shareText.watching;
        }

        lastFetched = System.currentTimeMillis();
    }*/


    public String getUsername() {
        return username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() { return gender; }

    public String getLocation() { return location; }

    public String getAbout() { return about; }

    public int getAge() { return age; }

    public int getLast_login() { return last_login; }

    public boolean isTwitterConnected() {
        return twitterConnected;
    }

    public boolean isFacebookConnected() {
        return facebookConnected;
    }

    public boolean isPathConnected() {
        return pathConnected;
    }

    public boolean isTumblrConnected() {
        return tumblrConnected;
    }

    public long getLastFetched() {
        return lastFetched;
    }

    public String getDefaultShareMessage() {
        return defaultShareMessage;
    }
}
