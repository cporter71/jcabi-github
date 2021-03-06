/**
 * Copyright (c) 2012-2013, JCabi.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met: 1) Redistributions of source code must retain the above
 * copyright notice, this list of conditions and the following
 * disclaimer. 2) Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided
 * with the distribution. 3) Neither the name of the jcabi.com nor
 * the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jcabi.github;

/**
 * Mocker of {@link Issue}.
 *
 * @author Yegor Bugayenko (yegor@tpc2.com)
 * @version $Id$
 * @since 0.1
 */
public final class IssueMocker implements Issue {

    /**
     * Repo.
     */
    private final transient Repo owner;

    /**
     * Comments.
     */
    private final transient Comments cmnts;

    /**
     * Labels.
     */
    private final transient Labels lbls;

    /**
     * Title.
     */
    private transient String head;

    /**
     * Body.
     */
    private transient String text;

    /**
     * Public ctor.
     * @param repo Owner of it
     */
    public IssueMocker(final Repo repo) {
        this.owner = repo;
        this.cmnts = new CommentsMocker(this);
        this.lbls = new LabelsMocker();
        this.head = "";
        this.text = "";
    }

    @Override
    public Repo repo() {
        return this.owner;
    }

    @Override
    public int number() {
        return 1;
    }

    @Override
    public String title() {
        return this.head;
    }

    @Override
    public String body() {
        return this.text;
    }

    @Override
    public void title(final String txt) {
        this.head = txt;
    }

    @Override
    public void body(final String txt) {
        this.text = txt;
    }

    @Override
    public Comments comments() {
        return this.cmnts;
    }

    @Override
    public Labels labels() {
        return this.lbls;
    }

}
