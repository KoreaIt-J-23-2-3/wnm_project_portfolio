import React from 'react';
/** @jsxImportSource @emotion/react */
import { css } from '@emotion/react';
import Header from '../Header/Header';
import * as S from './Style';

function RootLayout({ children }) {
    return (
        <div css={S.SLayout}>
            <Header />
            {children}
        </div>
    );
}

export default RootLayout;