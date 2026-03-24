/*
 * ------------------------------------------------------------------------
 * Max chat Bot API
 * ------------------------------------------------------------------------
 * Copyright (C) 2025 COMMUNICATION PLATFORM LLC
 * ------------------------------------------------------------------------
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
 * ------------------------------------------------------------------------
 */

package ru.max.botapi.queries.upload;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import ru.max.botapi.client.MaxClient;
import ru.max.botapi.exceptions.APIException;
import ru.max.botapi.exceptions.ClientException;
import ru.max.botapi.model.UploadEndpoint;
import ru.max.botapi.model.UploadedInfo;

public class MaxUploadAVQuery extends MaxUploadQuery<UploadedInfo> {

    private final MaxClient maxClient;
    private final UploadEndpoint uploadEndpoint;

    public MaxUploadAVQuery(MaxClient maxClient, UploadEndpoint uploadEndpoint, File file) {
        super(maxClient, UploadedInfo.class, uploadEndpoint.getUrl(), file);
        this.uploadEndpoint = uploadEndpoint;
        this.maxClient = maxClient;
    }

    public MaxUploadAVQuery(MaxClient maxClient, UploadEndpoint uploadEndpoint, String fileName, InputStream input) {
        super(maxClient, UploadedInfo.class, uploadEndpoint.getUrl(), fileName, input);
        this.uploadEndpoint = uploadEndpoint;
        this.maxClient = maxClient;
    }

    @Override
    public UploadedInfo execute() throws APIException, ClientException {
        try {
            return maxClient.newCall(this).get();
        } catch (InterruptedException e) {
            throw new ClientException("Current upload AV request was interrupted", e);
        } catch (ExecutionException e) {
            return unwrap(e);
        }
    }

    @Override
    public Future<UploadedInfo> enqueue() throws ClientException {
        return maxClient.newCall(this);
    }

    public UploadedInfo getUploadedInfo() {
        return new UploadedInfo().token(uploadEndpoint.getToken());
    }
}
