/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.newsapp;

/**
 * An {@link Article} object contains information related to a single article.
 */
public class Article {

    /**
     * Title of the article
     */
    private String mTitle;

    /**
     * Name of the Section
     */
    private String mSectionName;

    /**
     * Name of the author
     */
    private String mAuthorName;

    /**
     * Date of publishing
     */
    private String mPublishDate;

    /**
     * Website URL of the News
     */
    private String mUrl;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param title       is the title of the article
     * @param sectionName is the name of the section
     * @param authorName  is the name of the author
     * @param publishDate is the date of publishing the article
     * @param url         is the website URL to find more details about the article
     */
    public Article(String title, String sectionName, String authorName, String publishDate, String url) {
        mTitle = title;
        mSectionName = sectionName;
        mAuthorName = authorName;
        mPublishDate = publishDate;
        mUrl = url;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section name of the article.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the author name of the article.
     */
    public String getAuthorName() {
        return mAuthorName;
    }

    /**
     * Returns the author name of the article.
     */
    public String getPublishDate() {
        return mPublishDate;
    }

    /**
     * Returns the website URL to find more details about the article.
     */
    public String getUrl() {
        return mUrl;
    }
}
